package threading.lesson5ProducerConsumer;

import java.util.List;

public class Producer implements Runnable {
    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("Question have pilled up ... wait for answer");
                questionList.wait();
            }
        }
        synchronized (questionList) {
            System.out.println("New Question" + questionNo);
            questionList.add(questionNo);
            Thread.sleep(100);
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                readQuestion(questionNo++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
