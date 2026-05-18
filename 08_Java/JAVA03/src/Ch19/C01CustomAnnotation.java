package Ch19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)	// 애노테이션의 유지기간(프로그램 동작중인 상태에서만 실행)
@Target({ElementType.TYPE,ElementType.METHOD})	
public @interface C01CustomAnnotation {
	String value() default "HELLO WORLD";
	int number() default 1;
	boolean isOpen() default false;
}
// ElemetType.TYPE : 클래스, 인터페이스, eum ... 적용
// ElemetType.FIELD : 멤버 변수에 적용
// ElemetType.METHOD : 메소드에 적용

	