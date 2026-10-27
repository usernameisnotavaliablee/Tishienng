package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MenuKt {
    public static final boolean contains(@org.jetbrains.annotations.NotNull android.view.Menu r4, @org.jetbrains.annotations.NotNull android.view.MenuItem r5) {
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            android.view.MenuItem r3 = r4.getItem(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r5)
            if (r3 == 0) goto L14
            r4 = 1
            return r4
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r1
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.view.Menu r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.n1> r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.MenuItem r2 = r3.getItem(r1)
            r4.invoke(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    public static final void forEachIndexed(@org.jetbrains.annotations.NotNull android.view.Menu r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.MenuItem, kotlin.n1> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.MenuItem r3 = r4.getItem(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.view.MenuItem get(@org.jetbrains.annotations.NotNull android.view.Menu r0, int r1) {
            android.view.MenuItem r0 = r0.getItem(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<android.view.MenuItem> getChildren(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            androidx.core.view.MenuKt$children$1 r0 = new androidx.core.view.MenuKt$children$1
            r0.<init>(r1)
            return r0
    }

    public static final int getSize(@org.jetbrains.annotations.NotNull android.view.Menu r0) {
            int r0 = r0.size()
            return r0
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.view.Menu r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.view.Menu r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Iterator<android.view.MenuItem> iterator(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            androidx.core.view.MenuKt$iterator$1 r0 = new androidx.core.view.MenuKt$iterator$1
            r0.<init>(r1)
            return r0
    }

    public static final void minusAssign(@org.jetbrains.annotations.NotNull android.view.Menu r0, @org.jetbrains.annotations.NotNull android.view.MenuItem r1) {
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            return
    }

    public static final void removeItemAt(@org.jetbrains.annotations.NotNull android.view.Menu r0, int r1) {
            android.view.MenuItem r1 = r0.getItem(r1)
            if (r1 == 0) goto L10
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            kotlin.n1 r0 = kotlin.n1.a
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L14
            return
        L14:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
