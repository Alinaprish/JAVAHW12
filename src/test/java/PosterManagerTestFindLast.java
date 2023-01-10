import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterObject;

public class PosterManagerTestFindLast {

    PosterManager man = new PosterManager();

    PosterObject object1 = new PosterObject("Бладшот");
    PosterObject object2 = new PosterObject("Вперёд");
    PosterObject object3 = new PosterObject("Отель <<Булград>>");
    PosterObject object4 = new PosterObject("Джентльмены");
    PosterObject object5 = new PosterObject("Человек-невидимка");
    PosterObject object6 = new PosterObject("Тролли.Мировой тур");
    PosterObject object7 = new PosterObject("Номер один");

    @BeforeEach
    public void setup() {
        man.add(object1);
        man.add(object2);
        man.add(object3);
        man.add(object4);
        man.add(object5);
        man.add(object6);
        man.add(object7);
    }


    @Test
    public void test() {

        man.setResultLength(5);

        PosterObject[] expected = {object7, object6, object5, object4, object3};
        PosterObject[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testtwo() {

        man.setResultLength(7);

        PosterObject[] expected = {object7, object6, object5, object4, object3, object2, object1};
        PosterObject[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
