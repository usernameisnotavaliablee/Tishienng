package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PersistableBundleKt {
    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle persistableBundleOf() {
            r0 = 0
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle persistableBundleOf(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r5) {
            int r0 = r5.length
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1b
            r3 = r5[r2]
            java.lang.Object r4 = r3.component1()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.component2()
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(r0, r4, r3)
            int r2 = r2 + 1
            goto L7
        L1b:
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle toPersistableBundle(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
            int r0 = r3.size()
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(r0, r2, r1)
            goto L10
        L2a:
            return r0
    }
}
