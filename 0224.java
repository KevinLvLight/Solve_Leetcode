public int calculate(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> symbols = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
			
            if (Character.isDigit(ch)) {
				// calculate the whole number in a single go
                int num = ch - '0';
                while (i < str.length() - 1) {
                    char nextChar = str.charAt(i + 1);
                    if (!Character.isDigit(nextChar)) {
                        break;
                    }
                    num = num * 10 + (nextChar - '0');
                    i++;
                }
                if (!symbols.isEmpty() && isOperator(symbols.peek())) {
                    numbers.push(applyOperation(num, symbols.pop(), numbers.pop()));
                } else {
                    numbers.push(num);
                }
            } 
			
			
			
			
			else if (isOperator(ch)) {
                while (!symbols.empty() && isOperator(symbols.peek())) {
                    numbers.push(applyOperation(numbers.pop(), symbols.pop(), numbers.pop()));
                }
                symbols.push(ch);
            } else if (ch == '(') {
                symbols.push(ch);
            } else if (ch == ')') {
                while (symbols.peek() != '(') {
                    numbers.push(applyOperation(numbers.pop(), symbols.pop(), numbers.pop()));
                }
                symbols.pop();
            }
        }
        while (!symbols.empty()) {
            numbers.push(applyOperation(numbers.pop(), symbols.pop(), numbers.pop()));
        }
        return numbers.pop();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-';
    }

    private int applyOperation(int var2, char ch, Integer var1) {
        switch (ch) {
            case '+':
                return var1 + var2;
            case '-':
                return var1 - var2;
            default:
                throw new IllegalArgumentException("Not a valid operator: " + ch);
        }
    }