package com.MiniQuiz

object Constants {

    // Създаваме класове за въпроси и отговорите

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Основите на ЕС са положени през?",
            0,
            "01.01.1958", "27.11.1978",
            "11.03.1995", "06.07.2001", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Най-старата държава на Европа е?",
            0,
            "Сърбия", "Чехия",
            "България", "Германия", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Кой велик гений през 1952 получава предложение да стане президент на Израел?",
           0,
            "Никола Тесла", "Алберт Айнщайн",
            "Томас Едисън", "Хенри Форд", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Най-кратката война с продължителност 38 минути е между?",
            0,
            "Великобритания и Дания", "Германия и Занзибар",
            "Русия и Полша", "Великобритания и Занзибар", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Автоматината скоростна кутия била изобретена от?",
            0,
            "Асен Йорданов(българин)", "Фредрих Езеро(италиянец)",
            "Кевин Кулин(американец)", "Ханс Мюлер(германец)", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "На коя страна е това знаме?",
            R.drawable.ic_flag_of_finland,
            "Филипините", "Швейцария",
            "Финландия", "Гърция", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Сто годишната война между Англия и Франция продължава?",
            0,
            "102 години", "100 години",
            "110 години", "116 години", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Коя страна никога не е губила знаме по време на битка?",
            0,
            "България", "Япония",
            "Русия", "САЩ", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Най-голямата държава по площ в света е?",
            0,
            "Канада", "Русия",
            "Китай", "Индия", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Първия полет със самолет бива извършен от братя Райт през?",
            0,
            "15.03.1977", "07.06.1954",
            "17.12.1903", "12.04.1942", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}