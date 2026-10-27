package androidx.lifecycle.viewmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class InitializerViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.viewmodel.ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(@org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r2) {
            r1 = this;
            java.lang.String r0 = "initializers"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.initializers = r2
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ androidx.lifecycle.ViewModel create(java.lang.Class r1) {
            r0 = this;
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.l.a(r0, r1)
            return r1
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r8, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r9) {
            r7 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.g0.p(r9, r0)
            androidx.lifecycle.viewmodel.ViewModelInitializer<?>[] r0 = r7.initializers
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
        L10:
            if (r3 >= r1) goto L31
            r5 = r0[r3]
            java.lang.Class r6 = r5.getClazz$lifecycle_viewmodel_release()
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r8)
            if (r6 == 0) goto L2e
            kotlin.jvm.functions.Function1 r4 = r5.getInitializer$lifecycle_viewmodel_release()
            java.lang.Object r4 = r4.invoke(r9)
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModel
            if (r5 == 0) goto L2d
            androidx.lifecycle.ViewModel r4 = (androidx.lifecycle.ViewModel) r4
            goto L2e
        L2d:
            r4 = r2
        L2e:
            int r3 = r3 + 1
            goto L10
        L31:
            if (r4 == 0) goto L34
            return r4
        L34:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No initializer set for given class "
            r0.append(r1)
            java.lang.String r8 = r8.getName()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }
}
