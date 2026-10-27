package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements android.text.TextWatcher {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.text.Editable, kotlin.n1> $afterTextChanged;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.n1> $beforeTextChanged;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.n1> $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.n1> r1, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r2, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r3) {
            r0 = this;
            r0.$afterTextChanged = r1
            r0.$beforeTextChanged = r2
            r0.$onTextChanged = r3
            r0.<init>()
            return
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@org.jetbrains.annotations.Nullable android.text.Editable r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.text.Editable, kotlin.n1> r0 = r1.$afterTextChanged
            r0.invoke(r2)
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.n1> r0 = r1.$beforeTextChanged
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.invoke(r2, r3, r4, r5)
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@org.jetbrains.annotations.Nullable java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.n1> r0 = r1.$onTextChanged
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.invoke(r2, r3, r4, r5)
            return
    }
}
