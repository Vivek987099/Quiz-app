class Question {
    String questionText;
    String[] options;
    int correctAnswer; // 1, 2, 3, 4 etc.
    
    Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}
