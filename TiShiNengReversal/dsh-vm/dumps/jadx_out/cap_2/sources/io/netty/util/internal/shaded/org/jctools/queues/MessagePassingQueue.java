package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface MessagePassingQueue<T> {
    public static final int UNBOUNDED_CAPACITY = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Consumer<T> {
        void accept(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ExitCondition {
        boolean keepRunning();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Supplier<T> {
        T get();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface WaitStrategy {
        int idle(int r1);
    }

    int capacity();

    void clear();

    int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<T> r1);

    int drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<T> r1, int r2);

    void drain(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer<T> r1, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r2, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r3);

    int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<T> r1);

    int fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<T> r1, int r2);

    void fill(io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier<T> r1, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy r2, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.ExitCondition r3);

    boolean isEmpty();

    boolean offer(T r1);

    T peek();

    T poll();

    boolean relaxedOffer(T r1);

    T relaxedPeek();

    T relaxedPoll();

    int size();
}
