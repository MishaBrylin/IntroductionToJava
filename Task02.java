

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
// (Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)
public class Task02 {
    public static void main(String[] args) {
        Task02s arr = new Task02s();
        arr.enqueue(1);
        arr.enqueue(2);
        arr.enqueue(3);
        arr.enqueue(4);
        arr.printArr();
        arr.dequeue();
        arr.printArr();
        arr.first();
        arr.printArr();

        


    }
    
    

    
}
