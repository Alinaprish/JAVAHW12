import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterObject;

public class PosterManagerTestSave {

    PosterObject object1 = new PosterObject("Бладшот");
    PosterObject object2 = new PosterObject("Вперёд");
    PosterObject object3 = new PosterObject("Отель <<Булград>>");
    PosterObject object4 = new PosterObject("Джентльмены");
    PosterObject object5 = new PosterObject("Человек-невидимка");
    PosterObject object6 = new PosterObject("Тролли.Мировой тур");
    PosterObject object7 = new PosterObject("Номер один");

    @Test
    public void test() {
        PosterManager man = new PosterManager();

        man.save(object1);
        man.save(object2);
        man.save(object3);
        man.save(object4);
        man.save(object5);
        man.save(object6);
        man.save(object7);

        PosterObject[] expected = {object1, object2, object3, object4, object5, object6, object7};
        PosterObject[] actual = man.getObject();

        Assertions.assertArrayEquals(expected, actual);

    }
}
