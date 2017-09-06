package Day12_Generics.MyList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class My_IterateList<T> implements Iterable{

    private Element<T> _head;
    private Element<T> _tail;
    private int _counter;


    public void printListForward() {
        if (_head != null) {
            Element<T> p = _head;
            while (p.getNextElement() != null) {
                System.out.println(p.getData().toString());
                p = p.getNextElement();
            }
            System.out.println(_tail.getData());

        }
    }


    public void printListBack() {
        if (_tail != null) {
            Element<T> p = _tail;
            while (p.getPrevElement() != null) {
                System.out.println(p.getData().toString());
                p = p.getPrevElement();
            }
            System.out.println(_head.getData());
        }
    }

    public boolean contains(T Data) {
        Element p = _tail;
        while (p.getPrevElement() != null) {
            if (p.getData().equals(Data)) return true;
            p = p.getPrevElement();
        }
        return false;
    }

    public T get(int index) {
        int counter = 0;
        Element temp = _head;
        while (counter != index) {
            temp = temp.getNextElement();
            counter++;
        }
        return (T)temp.getData();
    }


    public  void add(T... data) {
        for (T singleData : data) {
            if (_head == null) {
                _head = new Element(null, singleData);
                _tail = _head;
            } else {
                _tail = new Element(_tail, singleData);
                _tail.getPrevElement().setNextElement(_tail);
            }
            _counter++;
        }
    }

    public void addOnBeginning(T data) {
        _head = new Element(data, _head);
        _head.getNextElement().setPrevElement(_head);
        _counter++;
    }

    public void remove(Element p) {
        try {

            if (_head == p) {
                _head = p.getNextElement();
                _head.setPrevElement(null);
            } else {
                p.getPrevElement().setNextElement(p.getNextElement());
            }

            if (_tail == p) {
                _tail = p;
                _tail.setNextElement(null);
            } else {
                p.getNextElement().setPrevElement(p.getPrevElement());
            }
        } catch (NullPointerException ex) {
        }
        _counter--;
    }

    public int length() {
        return _counter;
    }


    public Stream stream(){
        Stream.Builder<T> b=Stream.builder();
        Element p=_head;
        while (p!=_tail){
            b.add((T) p.getData());
            p=p.getNextElement();
        }
        b.add(_tail.getData());
        Stream<T> s=b.build();
        return s;

    }

    @Override
    public Iterator iterator() {
        Iterator<Element> it=new Iterator<Element>() {
            private Element<T> currentElement=_head;

            @Override
            public boolean hasNext() {
                return currentElement!=null;
            }

            @Override
            public Element<T> next() {
                Element toReturn=currentElement;
                currentElement=currentElement.getNextElement();
                return toReturn;
            }
        };
        return it;
    }

    //NIE DIZALA
    @Override
    public void forEach(Consumer action) {
        Element<T> element=_head;
        Iterator<Element> iterator=iterator();
        while (iterator.hasNext()){
            action.accept(element);
            element=iterator.next();
        }
    }

    //NIE DIZALA
    @Override
    public Spliterator spliterator() {
        Spliterator it=new Spliterator<T>(){
            @Override
            public boolean tryAdvance(Consumer action) {
                return false;
            }

            @Override
            public Spliterator trySplit() {
                return null;
            }

            @Override
            public long estimateSize() {
                return 0;
            }

            @Override
            public int characteristics() {
                return 0;
            }
        };
        return it;
    }
}




