/**
 * BaseServiceクラスを実装する抽象クラス
 */
public abstract class AbstractBaseService implements BaseService {
    protected String name;

    public AbstractBaseService(String name) {
        this.name = name;
    }
}
