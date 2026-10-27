package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableInternalHelper {






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum ErrorMapperFilter extends java.lang.Enum<io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter> implements io.reactivex.functions.Function<io.reactivex.Notification<java.lang.Object>, java.lang.Throwable>, io.reactivex.functions.Predicate<io.reactivex.Notification<java.lang.Object>> {
        private static final /* synthetic */ io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter[] $VALUES = null;
        public static final io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter INSTANCE = null;

        static {
                io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter[] r1 = new io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter.$VALUES = r1
                return
        }

        ErrorMapperFilter(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter> r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter r1 = (io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter) r1
                return r1
        }

        public static io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter[] values() {
                io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter[] r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter[] r0 = (io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter[]) r0
                return r0
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Throwable apply(io.reactivex.Notification<java.lang.Object> r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                java.lang.Throwable r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public java.lang.Throwable apply2(io.reactivex.Notification<java.lang.Object> r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = r1.getError()
                return r1
        }

        /* renamed from: test, reason: avoid collision after fix types in other method */
        public boolean test2(io.reactivex.Notification<java.lang.Object> r1) throws java.lang.Exception {
                r0 = this;
                boolean r1 = r1.isOnError()
                return r1
        }

        @Override // io.reactivex.functions.Predicate
        public /* bridge */ /* synthetic */ boolean test(io.reactivex.Notification<java.lang.Object> r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                boolean r1 = r0.test2(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> mapper;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
                r0 = this;
                r0.<init>()
                r0.mapper = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<U> apply(T r3) throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableFromIterable r0 = new io.reactivex.internal.operators.observable.ObservableFromIterable
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1 = r2.mapper
                java.lang.Object r3 = r1.apply(r3)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                r0.<init>(r3)
                return r0
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
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
    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2) {
                r0 = this;
                r0.<init>()
                r0.combiner = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<R> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r0 = r4.mapper
                java.lang.Object r0 = r0.apply(r5)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                io.reactivex.internal.operators.observable.ObservableMap r1 = new io.reactivex.internal.operators.observable.ObservableMap
                io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerInner r2 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerInner
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3 = r4.combiner
                r2.<init>(r3, r5)
                r1.<init>(r0, r2)
                return r1
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> itemDelay;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r1) {
                r0 = this;
                r0.<init>()
                r0.itemDelay = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<T> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableTake r0 = new io.reactivex.internal.operators.observable.ObservableTake
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r1 = r4.itemDelay
                java.lang.Object r1 = r1.apply(r5)
                io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1
                r2 = 1
                r0.<init>(r1, r2)
                io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.justFunction(r5)
                io.reactivex.Observable r0 = r0.map(r1)
                io.reactivex.Observable r5 = r0.defaultIfEmpty(r5)
                return r5
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum MapToInt extends java.lang.Enum<io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt> implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[] $VALUES = null;
        public static final io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt INSTANCE = null;

        static {
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt[] r1 = new io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.$VALUES = r1
                return
        }

        MapToInt(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt> r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt r1 = (io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt) r1
                return r1
        }

        public static io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[] values() {
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt[] r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt[] r0 = (io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[]) r0
                return r0
        }

        @Override // io.reactivex.functions.Function
        public java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ObserverOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.Observer<T> observer;

        ObserverOnComplete(io.reactivex.Observer<T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Observer<T> r0 = r1.observer
                r0.onComplete()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ObserverOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.Observer<T> observer;

        ObserverOnError(io.reactivex.Observer<T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
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
                io.reactivex.Observer<T> r0 = r1.observer
                r0.onError(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ObserverOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.Observer<T> observer;

        ObserverOnNext(io.reactivex.Observer<T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.Observer<T> r0 = r1.observer
                r0.onNext(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RepeatWhenOuterHandler implements io.reactivex.functions.Function<io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, io.reactivex.ObservableSource<?>> {
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> handler;

        RepeatWhenOuterHandler(io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> r1) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                return
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public io.reactivex.ObservableSource<?> apply2(io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>> r3) throws java.lang.Exception {
                r2 = this;
                io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> r0 = r2.handler
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt r1 = io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.INSTANCE
                io.reactivex.Observable r3 = r3.map(r1)
                java.lang.Object r3 = r0.apply(r3)
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3
                return r3
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ io.reactivex.ObservableSource<?> apply(io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>> r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Observable r1 = (io.reactivex.Observable) r1
                io.reactivex.ObservableSource r1 = r0.apply2(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RetryWhenInner implements io.reactivex.functions.Function<io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, io.reactivex.ObservableSource<?>> {
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> handler;

        RetryWhenInner(io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> r1) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                return
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public io.reactivex.ObservableSource<?> apply2(io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>> r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableInternalHelper$ErrorMapperFilter r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.ErrorMapperFilter.INSTANCE
                io.reactivex.Observable r2 = r2.takeWhile(r0)
                io.reactivex.Observable r2 = r2.map(r0)
                io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> r0 = r1.handler
                java.lang.Object r2 = r0.apply(r2)
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2
                return r2
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ io.reactivex.ObservableSource<?> apply(io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>> r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Observable r1 = (io.reactivex.Observable) r1
                io.reactivex.ObservableSource r1 = r0.apply2(r1)
                return r1
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
    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1) {
                r0 = this;
                r0.<init>()
                r0.zipper = r1
                return
        }

        public io.reactivex.ObservableSource<? extends R> apply(java.util.List<io.reactivex.ObservableSource<? extends T>> r4) {
                r3 = this;
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r3.zipper
                r1 = 0
                int r2 = io.reactivex.Observable.bufferSize()
                io.reactivex.Observable r4 = io.reactivex.Observable.zipIterable(r4, r0, r1, r2)
                return r4
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    private ObservableInternalHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapIntoIterable r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapIntoIterable
            r0.<init>(r1)
            return r0
    }

    public static <T, U, R> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerOuter r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerOuter
            r0.<init>(r2, r1)
            return r0
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ItemDelayFunction r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ItemDelayFunction
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Action observerOnComplete(io.reactivex.Observer<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnComplete r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnComplete
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> observerOnError(io.reactivex.Observer<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnError r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnError
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<T> observerOnNext(io.reactivex.Observer<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnNext r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnNext
            r0.<init>(r1)
            return r0
    }

    public static io.reactivex.functions.Function<io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, io.reactivex.ObservableSource<?>> repeatWhenHandler(io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$RepeatWhenOuterHandler r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$RepeatWhenOuterHandler
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$1 r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$1
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r1, int r2) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$2 r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$2
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r7, int r8, long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$3 r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$3
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r6, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$4 r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$4
            r1 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r1, io.reactivex.Scheduler r2) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$5 r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$5
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, io.reactivex.ObservableSource<?>> retryWhenHandler(io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$RetryWhenInner r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$RetryWhenInner
            r0.<init>(r1)
            return r0
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleBiGenerator r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleBiGenerator
            r0.<init>(r1)
            return r0
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleGenerator r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleGenerator
            r0.<init>(r1)
            return r0
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ZipIterableFunction r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ZipIterableFunction
            r0.<init>(r1)
            return r0
    }
}
