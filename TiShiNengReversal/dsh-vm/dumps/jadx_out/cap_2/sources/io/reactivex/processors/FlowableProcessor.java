package io.reactivex.processors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class FlowableProcessor<T> extends io.reactivex.Flowable<T> implements org.reactivestreams.Processor<T, T> {
    public FlowableProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasSubscribers();

    public abstract boolean hasThrowable();

    public final io.reactivex.processors.FlowableProcessor<T> toSerialized() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.processors.SerializedProcessor
            if (r0 == 0) goto L5
            return r1
        L5:
            io.reactivex.processors.SerializedProcessor r0 = new io.reactivex.processors.SerializedProcessor
            r0.<init>(r1)
            return r0
    }
}
