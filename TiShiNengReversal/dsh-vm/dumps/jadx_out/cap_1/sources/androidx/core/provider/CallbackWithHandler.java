package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CallbackWithHandler {

    @androidx.annotation.NonNull
    private final androidx.core.provider.FontsContractCompat.FontRequestCallback mCallback;

    @androidx.annotation.NonNull
    private final android.os.Handler mCallbackHandler;



    CallbackWithHandler(@androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontRequestCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            android.os.Handler r1 = androidx.core.provider.CalleeHandler.create()
            r0.mCallbackHandler = r1
            return
    }

    CallbackWithHandler(@androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontRequestCallback r1, @androidx.annotation.NonNull android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            r0.mCallbackHandler = r2
            return
    }

    private void onTypefaceRequestFailed(int r4) {
            r3 = this;
            androidx.core.provider.FontsContractCompat$FontRequestCallback r0 = r3.mCallback
            android.os.Handler r1 = r3.mCallbackHandler
            androidx.core.provider.CallbackWithHandler$2 r2 = new androidx.core.provider.CallbackWithHandler$2
            r2.<init>(r3, r0, r4)
            r1.post(r2)
            return
    }

    private void onTypefaceRetrieved(@androidx.annotation.NonNull android.graphics.Typeface r4) {
            r3 = this;
            androidx.core.provider.FontsContractCompat$FontRequestCallback r0 = r3.mCallback
            android.os.Handler r1 = r3.mCallbackHandler
            androidx.core.provider.CallbackWithHandler$1 r2 = new androidx.core.provider.CallbackWithHandler$1
            r2.<init>(r3, r0, r4)
            r1.post(r2)
            return
    }

    void onTypefaceResult(@androidx.annotation.NonNull androidx.core.provider.FontRequestWorker.TypefaceResult r2) {
            r1 = this;
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto Lc
            android.graphics.Typeface r2 = r2.mTypeface
            r1.onTypefaceRetrieved(r2)
            return
        Lc:
            int r2 = r2.mResult
            r1.onTypefaceRequestFailed(r2)
            return
    }
}
