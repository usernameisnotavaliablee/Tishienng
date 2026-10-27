package com.google.firebase.encoders.config;

import com.google.firebase.encoders.config.EncoderConfig;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface EncoderConfig<T extends com.google.firebase.encoders.config.EncoderConfig<T>> {
    @androidx.annotation.NonNull
    <U> T registerEncoder(@androidx.annotation.NonNull java.lang.Class<U> r1, @androidx.annotation.NonNull com.google.firebase.encoders.ObjectEncoder<? super U> r2);

    @androidx.annotation.NonNull
    <U> T registerEncoder(@androidx.annotation.NonNull java.lang.Class<U> r1, @androidx.annotation.NonNull com.google.firebase.encoders.ValueEncoder<? super U> r2);
}
