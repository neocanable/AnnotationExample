public interface ICOperations<A,B> {
    A findById(B b);
    A saveOrUpdate(A a);
    <G> G deleteById(A a);
}
