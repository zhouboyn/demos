package aop;

public class GameMain {
    public static void main(String[] args) {
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptor();

        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);

        Role role = new Role(1L, "武松", "会打虎");

        proxy.printRole(role);

        System.out.println("-------------测试afterthrwoing方法------------------------");
        role = null;
        proxy.printRole(role);
    }
}
