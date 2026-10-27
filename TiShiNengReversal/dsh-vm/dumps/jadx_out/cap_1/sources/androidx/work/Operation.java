package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Operation {

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.work.Operation.State.IN_PROGRESS IN_PROGRESS = null;

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.work.Operation.State.SUCCESS SUCCESS = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.work.Operation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class State {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class FAILURE extends androidx.work.Operation.State {
            private final java.lang.Throwable mThrowable;

            public FAILURE(@androidx.annotation.NonNull java.lang.Throwable r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mThrowable = r1
                    return
            }

            @androidx.annotation.NonNull
            public java.lang.Throwable getThrowable() {
                    r1 = this;
                    java.lang.Throwable r0 = r1.mThrowable
                    return r0
            }

            @androidx.annotation.NonNull
            public java.lang.String toString() {
                    r3 = this;
                    java.lang.Throwable r0 = r3.mThrowable
                    java.lang.String r0 = r0.getMessage()
                    r1 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r0
                    java.lang.String r0 = "FAILURE (%s)"
                    java.lang.String r0 = java.lang.String.format(r0, r1)
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class IN_PROGRESS extends androidx.work.Operation.State {
            private IN_PROGRESS() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ IN_PROGRESS(androidx.work.Operation.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "IN_PROGRESS"
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class SUCCESS extends androidx.work.Operation.State {
            private SUCCESS() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ SUCCESS(androidx.work.Operation.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "SUCCESS"
                    return r0
            }
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        State() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.work.Operation$State$SUCCESS r0 = new androidx.work.Operation$State$SUCCESS
            r1 = 0
            r0.<init>(r1)
            androidx.work.Operation.SUCCESS = r0
            androidx.work.Operation$State$IN_PROGRESS r0 = new androidx.work.Operation$State$IN_PROGRESS
            r0.<init>(r1)
            androidx.work.Operation.IN_PROGRESS = r0
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getResult();

    @androidx.annotation.NonNull
    androidx.lifecycle.LiveData<androidx.work.Operation.State> getState();
}
