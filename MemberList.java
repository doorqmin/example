package dd;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MemberList<E> extends ArrayList<E> {
	private static final long serialVersionUID = -3241762591470277857L;

	private Predicate<E> member검증기;
	
	public MemberList(Predicate<E> member검증기) {
		super();
		this.member검증기 = member검증기;
	}
	
	@Override
	public boolean add(E e) {
		if (member검증기.test(e)) {
			super.add(e);
			return true;
		} else {
			return false;
		}
	}
}