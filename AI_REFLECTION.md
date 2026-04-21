1. **Gemini.**

2. **Prompt : in a check for division by 0 in a class, is it better to use it in a constructor and throw an exception od do i allow it and just return a value as if it doesn't match to ensure the whole app still runs even if someone adds a division by zero?  
Response: Allowing and treating as if it's just incorrect is just filling the app with garbage data that doesn't do anything and if it requires a divisor then feeding it a zero makes it inherently invalid.  
Helped me realize it is a silent failure and that it's slowly filling the memory with useless data, especially if silent failures and objects like that are common.**

3. **None**