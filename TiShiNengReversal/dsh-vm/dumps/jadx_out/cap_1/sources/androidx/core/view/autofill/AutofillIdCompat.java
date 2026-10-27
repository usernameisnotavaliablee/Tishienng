package androidx.core.view.autofill;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AutofillIdCompat {
    private final java.lang.Object mWrappedObj;

    @androidx.annotation.RequiresApi(26)
    private AutofillIdCompat(@androidx.annotation.NonNull android.view.autofill.AutofillId r1) {
            r0 = this;
            r0.<init>()
            r0.mWrappedObj = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public static androidx.core.view.autofill.AutofillIdCompat toAutofillIdCompat(@androidx.annotation.NonNull android.view.autofill.AutofillId r1) {
            androidx.core.view.autofill.AutofillIdCompat r0 = new androidx.core.view.autofill.AutofillIdCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public android.view.autofill.AutofillId toAutofillId() {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.autofill.AutofillId r0 = e.a.a(r0)
            return r0
    }
}
