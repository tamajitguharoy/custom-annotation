import java.lang.annotation.*;





	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
public	@interface Test {
	    String info() default "";
	}

	

