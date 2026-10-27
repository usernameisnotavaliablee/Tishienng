package com.google.firebase.encoders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ValueEncoderContext {
    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(double r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(float r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(int r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(long r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(@androidx.annotation.Nullable java.lang.String r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(boolean r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ValueEncoderContext add(@androidx.annotation.NonNull byte[] r1) throws java.io.IOException;
}
