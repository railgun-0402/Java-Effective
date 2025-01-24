

public class FooService extends AbstractBaseService{
    public FooService(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "FooService";
    }

    public void hello() {
        Object obj = new FooService("hello");

        System.out.println(obj instanceof FooService);
        System.out.println(obj instanceof AbstractBaseService); // 親クラスはtrue
        System.out.println(obj instanceof BaseService); // インターフェースを実装してるのでtrue
        System.out.println(obj instanceof Integer); // 継承関係がないのでfalse

        if (obj instanceof FooService) {
            FooService fooService = (FooService) obj;
            System.out.println(fooService.say());
        }
    }


}
