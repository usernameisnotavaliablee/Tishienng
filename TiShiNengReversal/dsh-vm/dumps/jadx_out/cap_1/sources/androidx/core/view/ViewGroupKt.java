package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewGroupKt {
    public static final boolean contains(@org.jetbrains.annotations.NotNull android.view.ViewGroup r0, @org.jetbrains.annotations.NotNull android.view.View r1) {
            int r0 = r0.indexOfChild(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.view.ViewGroup r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.n1> r4) {
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.View r2 = r3.getChildAt(r1)
            r4.invoke(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    public static final void forEachIndexed(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.n1> r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.View r3 = r4.getChildAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.view.View get(@org.jetbrains.annotations.NotNull android.view.ViewGroup r3, int r4) {
            android.view.View r0 = r3.getChildAt(r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size: "
            r1.append(r4)
            int r3 = r3.getChildCount()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<android.view.View> getChildren(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            androidx.core.view.ViewGroupKt$children$1 r0 = new androidx.core.view.ViewGroupKt$children$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<android.view.View> getDescendants(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1 r0 = new androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m getIndices(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            r0 = 0
            int r1 = r1.getChildCount()
            kotlin.ranges.m r1 = kotlin.ranges.t.W1(r0, r1)
            return r1
    }

    public static final int getSize(@org.jetbrains.annotations.NotNull android.view.ViewGroup r0) {
            int r0 = r0.getChildCount()
            return r0
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.view.ViewGroup r0) {
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.view.ViewGroup r0) {
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Iterator<android.view.View> iterator(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            androidx.core.view.ViewGroupKt$iterator$1 r0 = new androidx.core.view.ViewGroupKt$iterator$1
            r0.<init>(r1)
            return r0
    }

    public static final void minusAssign(@org.jetbrains.annotations.NotNull android.view.ViewGroup r0, @org.jetbrains.annotations.NotNull android.view.View r1) {
            r0.removeView(r1)
            return
    }

    public static final void plusAssign(@org.jetbrains.annotations.NotNull android.view.ViewGroup r0, @org.jetbrains.annotations.NotNull android.view.View r1) {
            r0.addView(r1)
            return
    }

    public static final void setMargins(@org.jetbrains.annotations.NotNull android.view.ViewGroup.MarginLayoutParams r0, @androidx.annotation.Px int r1) {
            r0.setMargins(r1, r1, r1, r1)
            return
    }

    public static final void updateMargins(@org.jetbrains.annotations.NotNull android.view.ViewGroup.MarginLayoutParams r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            r0.setMargins(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updateMargins$default(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.leftMargin
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.topMargin
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.rightMargin
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.bottomMargin
        L18:
            r0.setMargins(r1, r2, r3, r4)
            return
    }

    public static final void updateMarginsRelative(@org.jetbrains.annotations.NotNull android.view.ViewGroup.MarginLayoutParams r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            r0.setMarginStart(r1)
            r0.topMargin = r2
            r0.setMarginEnd(r3)
            r0.bottomMargin = r4
            return
    }

    public static /* synthetic */ void updateMarginsRelative$default(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getMarginStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r2 = r0.topMargin
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L16
            int r3 = r0.getMarginEnd()
        L16:
            r5 = r5 & 8
            if (r5 == 0) goto L1c
            int r4 = r0.bottomMargin
        L1c:
            r0.setMarginStart(r1)
            r0.topMargin = r2
            r0.setMarginEnd(r3)
            r0.bottomMargin = r4
            return
    }
}
