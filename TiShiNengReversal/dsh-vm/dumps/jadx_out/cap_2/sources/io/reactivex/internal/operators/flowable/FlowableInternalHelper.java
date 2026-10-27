package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableInternalHelper {






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> mapper;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
                r0 = this;
                r0.<init>()
                r0.mapper = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                org.reactivestreams.Publisher r1 = r0.apply(r1)
                return r1
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<U> apply(T r3) throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableFromIterable r0 = new io.reactivex.internal.operators.flowable.FlowableFromIterable
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1 = r2.mapper
                java.lang.Object r3 = r1.apply(r3)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                r0.<init>(r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FlatMapWithCombinerInner<U, R, T> implements io.reactivex.functions.Function<U, R> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final T t;

        FlatMapWithCombinerInner(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.combiner = r1
                r0.t = r2
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(U r3) throws java.lang.Exception {
                r2 = this;
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r0 = r2.combiner
                T r1 = r2.t
                java.lang.Object r3 = r0.apply(r1, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<R>> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r2) {
                r0 = this;
                r0.<init>()
                r0.combiner = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                org.reactivestreams.Publisher r1 = r0.apply(r1)
                return r1
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<R> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r0 = r4.mapper
                java.lang.Object r0 = r0.apply(r5)
                org.reactivestreams.Publisher r0 = (org.reactivestreams.Publisher) r0
                io.reactivex.internal.operators.flowable.FlowableMap r1 = new io.reactivex.internal.operators.flowable.FlowableMap
                io.reactivex.internal.operators.flowable.FlowableInternalHelper$FlatMapWithCombinerInner r2 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$FlatMapWithCombinerInner
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3 = r4.combiner
                r2.<init>(r3, r5)
                r1.<init>(r0, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<T>> {
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> itemDelay;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r1) {
                r0 = this;
                r0.<init>()
                r0.itemDelay = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                org.reactivestreams.Publisher r1 = r0.apply(r1)
                return r1
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<T> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableTake r0 = new io.reactivex.internal.operators.flowable.FlowableTake
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r1 = r4.itemDelay
                java.lang.Object r1 = r1.apply(r5)
                org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1
                r2 = 1
                r0.<init>(r1, r2)
                io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.justFunction(r5)
                io.reactivex.Flowable r0 = r0.map(r1)
                io.reactivex.Flowable r5 = r0.defaultIfEmpty(r5)
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum RequestMax extends java.lang.Enum<io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax> implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        private static final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax[] $VALUES = null;
        public static final io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax INSTANCE = null;

        static {
                io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax[] r1 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.$VALUES = r1
                return
        }

        RequestMax(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax> r0 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax r1 = (io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax) r1
                return r1
        }

        public static io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax[] values() {
                io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax[] r0 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax[] r0 = (io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax[]) r0
                return r0
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(org.reactivestreams.Subscription r1) throws java.lang.Exception {
                r0 = this;
                org.reactivestreams.Subscription r1 = (org.reactivestreams.Subscription) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(org.reactivestreams.Subscription r3) throws java.lang.Exception {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SimpleBiGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> consumer;

        SimpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.consumer = r1
                return
        }

        public S apply(S r2, io.reactivex.Emitter<T> r3) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r0 = r1.consumer
                r0.accept(r2, r3)
                return r2
        }

        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Emitter r2 = (io.reactivex.Emitter) r2
                java.lang.Object r1 = r0.apply(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SimpleGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer;

        SimpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.consumer = r1
                return
        }

        public S apply(S r2, io.reactivex.Emitter<T> r3) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r0 = r1.consumer
                r0.accept(r3)
                return r2
        }

        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Emitter r2 = (io.reactivex.Emitter) r2
                java.lang.Object r1 = r0.apply(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SubscriberOnComplete<T> implements io.reactivex.functions.Action {
        final org.reactivestreams.Subscriber<T> subscriber;

        SubscriberOnComplete(org.reactivestreams.Subscriber<T> r1) {
                r0 = this;
                r0.<init>()
                r0.subscriber = r1
                return
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
                r1 = this;
                org.reactivestreams.Subscriber<T> r0 = r1.subscriber
                r0.onComplete()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SubscriberOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final org.reactivestreams.Subscriber<T> subscriber;

        SubscriberOnError(org.reactivestreams.Subscriber<T> r1) {
                r0 = this;
                r0.<init>()
                r0.subscriber = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                org.reactivestreams.Subscriber<T> r0 = r1.subscriber
                r0.onError(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SubscriberOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final org.reactivestreams.Subscriber<T> subscriber;

        SubscriberOnNext(org.reactivestreams.Subscriber<T> r1) {
                r0 = this;
                r0.<init>()
                r0.subscriber = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T r2) throws java.lang.Exception {
                r1 = this;
                org.reactivestreams.Subscriber<T> r0 = r1.subscriber
                r0.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<org.reactivestreams.Publisher<? extends T>>, org.reactivestreams.Publisher<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1) {
                r0 = this;
                r0.<init>()
                r0.zipper = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                org.reactivestreams.Publisher r1 = r0.apply(r1)
                return r1
        }

        public org.reactivestreams.Publisher<? extends R> apply(java.util.List<org.reactivestreams.Publisher<? extends T>> r4) {
                r3 = this;
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r3.zipper
                r1 = 0
                int r2 = io.reactivex.Flowable.bufferSize()
                io.reactivex.Flowable r4 = io.reactivex.Flowable.zipIterable(r4, r0, r1, r2)
                return r4
        }
    }

    private FlowableInternalHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$FlatMapIntoIterable r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$FlatMapIntoIterable
            r0.<init>(r1)
            return r0
    }

    public static <T, U, R> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$FlatMapWithCombinerOuter r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$FlatMapWithCombinerOuter
            r0.<init>(r2, r1)
            return r0
    }

    public static <T, U> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$ItemDelayFunction r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$ItemDelayFunction
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$1 r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$1
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> r1, int r2) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$2 r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$2
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> r7, int r8, long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$3 r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$3
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> r6, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$4 r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$4
            r1 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Flowable<T>, org.reactivestreams.Publisher<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r1, io.reactivex.Scheduler r2) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$5 r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$5
            r0.<init>(r1, r2)
            return r0
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$SimpleBiGenerator r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$SimpleBiGenerator
            r0.<init>(r1)
            return r0
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$SimpleGenerator r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$SimpleGenerator
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Action subscriberOnComplete(org.reactivestreams.Subscriber<T> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$SubscriberOnComplete r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$SubscriberOnComplete
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> subscriberOnError(org.reactivestreams.Subscriber<T> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$SubscriberOnError r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$SubscriberOnError
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<T> subscriberOnNext(org.reactivestreams.Subscriber<T> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$SubscriberOnNext r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$SubscriberOnNext
            r0.<init>(r1)
            return r0
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<org.reactivestreams.Publisher<? extends T>>, org.reactivestreams.Publisher<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1) {
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$ZipIterableFunction r0 = new io.reactivex.internal.operators.flowable.FlowableInternalHelper$ZipIterableFunction
            r0.<init>(r1)
            return r0
    }
}
