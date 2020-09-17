# @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

## TL;DR

`@Component` 与 `@Bean` 都是用于声明Spring IoC容器中Bean的注解，但是他们的职责（functionality）不同，使用场景也不同。([ref](https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s12.html))

## 历史

在Spring中，被IoC容器管理的对象被称为`bean` ([ref](https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/beans.html)) 



在传统的Spring开发中，开发者需要编写`applicationContext.xml`文件，显式地配置IoC容器中的bean。

采用XML方式配置bean时，bean的定义信息与Java代码中的实现是分离的，因此之后的Spring版本支持了使用注解的方式将bean的定义信息写在Java的类中。

## @Component

- 使用在类名上，即类级注解 class level annotation
- 使用此注解的类，会被IoC容器通过路径扫描自动配置到容器中
- 具有衍生注解
  - `@Controller`
  - `@Service`
  - `@Repository`

## @Bean

- 使用于IoC容器类中的方法上
- 使用此注解的方法，返回一个对象，这个对象会被配置到IoC容器中



