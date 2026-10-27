package com.google.firebase.encoders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ObjectEncoderContext {
    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, double r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, float r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, int r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, long r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, @androidx.annotation.Nullable java.lang.Object r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, boolean r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r1, double r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r1, int r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r1, long r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.lang.Object r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r1, boolean r2) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext inline(@androidx.annotation.Nullable java.lang.Object r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext nested(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1) throws java.io.IOException;

    @androidx.annotation.NonNull
    com.google.firebase.encoders.ObjectEncoderContext nested(@androidx.annotation.NonNull java.lang.String r1) throws java.io.IOException;
}
