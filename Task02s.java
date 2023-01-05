// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
// (Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)

import java.util.LinkedList;

public class Task02s {
    LinkedList<Integer> arr = new LinkedList<>();

    public void enqueue(int intem) {
        
        arr.addLast(intem);

    }

    public void dequeue() {
        System.out.println(arr.getFirst());
        arr.removeFirst();
    }

    public void first() {
        System.out.println(arr.getFirst());
        
    }
    
    public void printArr() {
        System.out.println(arr);
        
    }
    
}
