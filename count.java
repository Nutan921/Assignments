class Count {
    public static void main(String[] args) {
        String stat= "Hello everyone 123";
        int vowels = 0;
        int consonants = 0;
        int numbers = 0;
        int spaces = 0;
        stat = stat.toLowerCase();
        for(int i = 0; i < stat.length(); ++i)
        {
            char ch = stat.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++numbers;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + numbers);
        System.out.println("spaces: " + spaces);
    }
}
