package androidx.camera.core.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final java.lang.String TAG = "ImmediateFuture";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ImmediateFailedFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {

        @androidx.annotation.NonNull
        private final java.lang.Throwable mCause;

        ImmediateFailedFuture(@androidx.annotation.NonNull java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.mCause = r1
                return
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture
        @androidx.annotation.Nullable
        public V get() throws java.util.concurrent.ExecutionException {
                r2 = this;
                java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
                java.lang.Throwable r1 = r2.mCause
                r0.<init>(r1)
                throw r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "[status=FAILURE, cause=["
                r0.append(r1)
                java.lang.Throwable r1 = r2.mCause
                r0.append(r1)
                java.lang.String r1 = "]]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ImmediateFailedScheduledFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
        ImmediateFailedScheduledFuture(@androidx.annotation.NonNull java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull java.util.concurrent.Delayed r1) {
                r0 = this;
                java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(@androidx.annotation.NonNull java.util.concurrent.Delayed r1) {
                r0 = this;
                r1 = -1
                return r1
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(@androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ImmediateSuccessfulFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        static final androidx.camera.core.impl.utils.futures.ImmediateFuture<java.lang.Object> NULL_FUTURE = null;

        @androidx.annotation.Nullable
        private final V mValue;

        static {
                androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateSuccessfulFuture r0 = new androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateSuccessfulFuture
                r1 = 0
                r0.<init>(r1)
                androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture.NULL_FUTURE = r0
                return
        }

        ImmediateSuccessfulFuture(@androidx.annotation.Nullable V r1) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                return
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture
        @androidx.annotation.Nullable
        public V get() {
                r1 = this;
                V r0 = r1.mValue
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "[status=SUCCESS, result=["
                r0.append(r1)
                V r1 = r2.mValue
                r0.append(r1)
                java.lang.String r1 = "]]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    ImmediateFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nullFuture() {
            androidx.camera.core.impl.utils.futures.ImmediateFuture<java.lang.Object> r0 = androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture.NULL_FUTURE
            return r0
    }

    public void addListener(@androidx.annotation.NonNull java.lang.Runnable r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5) {
            r3 = this;
            androidx.core.util.Preconditions.checkNotNull(r4)
            androidx.core.util.Preconditions.checkNotNull(r5)
            r5.execute(r4)     // Catch: java.lang.RuntimeException -> La
            return
        La:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Experienced RuntimeException while attempting to notify "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " on Executor "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "ImmediateFuture"
            androidx.camera.core.Logger.e(r5, r4, r0)
            return
    }

    public boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    public abstract V get() throws java.util.concurrent.ExecutionException;

    @androidx.annotation.Nullable
    public V get(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) throws java.util.concurrent.ExecutionException {
            r0 = this;
            androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.Object r1 = r0.get()
            return r1
    }

    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isDone() {
            r1 = this;
            r0 = 1
            return r0
    }
}
