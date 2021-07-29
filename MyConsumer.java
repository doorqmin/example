package dd;

@FunctionalInterface
interface MyConsumer<T> {
	void accept(T arg);
}
