package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "Transformations")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Transformations {
    @kotlin.jvm.JvmName(name = "distinctUntilChanged")
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.CheckResult
    @androidx.annotation.MainThread
    public static final <X> androidx.lifecycle.LiveData<X> distinctUntilChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<X> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            r2 = 1
            r1.element = r2
            boolean r2 = r3.isInitialized()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r3.getValue()
            r0.setValue(r2)
            r2 = 0
            r1.element = r2
        L22:
            androidx.lifecycle.Transformations$distinctUntilChanged$1 r2 = new androidx.lifecycle.Transformations$distinctUntilChanged$1
            r2.<init>(r0, r1)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r1 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r1.<init>(r2)
            r0.addSource(r3, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "map")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.CheckResult
    @androidx.annotation.MainThread
    public static final /* synthetic */ androidx.lifecycle.LiveData map(androidx.lifecycle.LiveData r2, androidx.arch.core.util.Function r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mapFunction"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$map$2 r1 = new androidx.lifecycle.Transformations$map$2
            r1.<init>(r0, r3)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r3 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r3.<init>(r1)
            r0.addSource(r2, r3)
            return r0
    }

    @kotlin.jvm.JvmName(name = "map")
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.CheckResult
    @androidx.annotation.MainThread
    public static final <X, Y> androidx.lifecycle.LiveData<Y> map(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<X> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<X, Y> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$map$1 r1 = new androidx.lifecycle.Transformations$map$1
            r1.<init>(r0, r3)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r3 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r3.<init>(r1)
            r0.addSource(r2, r3)
            return r0
    }

    @kotlin.jvm.JvmName(name = "switchMap")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.CheckResult
    @androidx.annotation.MainThread
    public static final /* synthetic */ androidx.lifecycle.LiveData switchMap(androidx.lifecycle.LiveData r2, androidx.arch.core.util.Function r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "switchMapFunction"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$switchMap$2 r1 = new androidx.lifecycle.Transformations$switchMap$2
            r1.<init>(r3, r0)
            r0.addSource(r2, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "switchMap")
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.CheckResult
    @androidx.annotation.MainThread
    public static final <X, Y> androidx.lifecycle.LiveData<Y> switchMap(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<X> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<X, androidx.lifecycle.LiveData<Y>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$switchMap$1 r1 = new androidx.lifecycle.Transformations$switchMap$1
            r1.<init>(r3, r0)
            r0.addSource(r2, r1)
            return r0
    }
}
