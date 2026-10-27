package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n65#1:98\n77#1,4:99\n93#1,3:103\n65#1,16:106\n93#1,3:122\n65#1,16:125\n93#1,3:141\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n35#1:98\n35#1:99,4\n35#1:103,3\n49#1:106,16\n49#1:122,3\n58#1:125,16\n58#1:141,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TextViewKt {
    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher addTextChangedListener(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.n1> r4) {
            androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 r0 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1
            r0.<init>(r4, r2, r3)
            r1.addTextChangedListener(r0)
            return r0
    }

    public static /* synthetic */ android.text.TextWatcher addTextChangedListener$default(android.widget.TextView r0, kotlin.jvm.functions.Function4 r1, kotlin.jvm.functions.Function4 r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            androidx.core.widget.TextViewKt$addTextChangedListener$1 r1 = androidx.core.widget.TextViewKt$addTextChangedListener$1.INSTANCE
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            androidx.core.widget.TextViewKt$addTextChangedListener$2 r2 = androidx.core.widget.TextViewKt$addTextChangedListener$2.INSTANCE
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            androidx.core.widget.TextViewKt$addTextChangedListener$3 r3 = androidx.core.widget.TextViewKt$addTextChangedListener$3.INSTANCE
        L12:
            androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 r4 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1
            r4.<init>(r3, r1, r2)
            r0.addTextChangedListener(r4)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doAfterTextChanged(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.n1> r2) {
            androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 r0 = new androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            r0.<init>(r2)
            r1.addTextChangedListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doBeforeTextChanged(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r2) {
            androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 r0 = new androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            r0.<init>(r2)
            r1.addTextChangedListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doOnTextChanged(@org.jetbrains.annotations.NotNull android.widget.TextView r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r2) {
            androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 r0 = new androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            r0.<init>(r2)
            r1.addTextChangedListener(r0)
            return r0
    }
}
