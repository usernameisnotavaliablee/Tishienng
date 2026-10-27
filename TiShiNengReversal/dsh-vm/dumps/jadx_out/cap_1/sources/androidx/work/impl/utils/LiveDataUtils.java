package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LiveDataUtils {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    class AnonymousClass1<In> implements androidx.lifecycle.Observer<In> {
        Out mCurrentOutput;
        final /* synthetic */ java.lang.Object val$lock;
        final /* synthetic */ androidx.arch.core.util.Function val$mappingMethod;
        final /* synthetic */ androidx.lifecycle.MediatorLiveData val$outputLiveData;
        final /* synthetic */ androidx.work.impl.utils.taskexecutor.TaskExecutor val$workTaskExecutor;


        AnonymousClass1(androidx.work.impl.utils.taskexecutor.TaskExecutor r1, java.lang.Object r2, androidx.arch.core.util.Function r3, androidx.lifecycle.MediatorLiveData r4) {
                r0 = this;
                r0.val$workTaskExecutor = r1
                r0.val$lock = r2
                r0.val$mappingMethod = r3
                r0.val$outputLiveData = r4
                r0.<init>()
                r1 = 0
                r0.mCurrentOutput = r1
                return
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@androidx.annotation.Nullable In r3) {
                r2 = this;
                androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r2.val$workTaskExecutor
                androidx.work.impl.utils.LiveDataUtils$1$1 r1 = new androidx.work.impl.utils.LiveDataUtils$1$1
                r1.<init>(r2, r3)
                r0.executeOnBackgroundThread(r1)
                return
        }
    }

    private LiveDataUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <In, Out> androidx.lifecycle.LiveData<Out> dedupedMappedLiveDataFor(@androidx.annotation.NonNull androidx.lifecycle.LiveData<In> r3, @androidx.annotation.NonNull androidx.arch.core.util.Function<In, Out> r4, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r5) {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.lifecycle.MediatorLiveData r1 = new androidx.lifecycle.MediatorLiveData
            r1.<init>()
            androidx.work.impl.utils.LiveDataUtils$1 r2 = new androidx.work.impl.utils.LiveDataUtils$1
            r2.<init>(r5, r0, r4, r1)
            r1.addSource(r3, r2)
            return r1
    }
}
