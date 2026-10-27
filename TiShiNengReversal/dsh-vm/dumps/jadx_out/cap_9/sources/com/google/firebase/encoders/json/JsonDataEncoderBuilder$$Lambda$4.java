package com.google.firebase.encoders.json;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$4 implements com.google.firebase.encoders.ValueEncoder {
    private static final com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4 instance = null;

    static {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4 r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4
            r0.<init>()
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4.instance = r0
            return
    }

    private JsonDataEncoderBuilder$$Lambda$4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.encoders.ValueEncoder lambdaFactory$() {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4 r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4.instance
            return r0
    }

    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object r1, com.google.firebase.encoders.ValueEncoderContext r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.encoders.ValueEncoderContext r2 = (com.google.firebase.encoders.ValueEncoderContext) r2
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.lambda$static$1(r1, r2)
            return
    }
}
