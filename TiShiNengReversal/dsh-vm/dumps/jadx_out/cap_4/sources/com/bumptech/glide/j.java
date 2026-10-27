package com.bumptech.glide;

import com.bumptech.glide.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j<CHILD extends com.bumptech.glide.j<CHILD, TranscodeType>, TranscodeType> implements java.lang.Cloneable {
    private com.bumptech.glide.request.transition.g<? super TranscodeType> a;

    public j() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.transition.g r0 = com.bumptech.glide.request.transition.e.c()
            r1.a = r0
            return
    }

    private CHILD e() {
            r0 = this;
            return r0
    }

    public final CHILD a() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.bumptech.glide.j r0 = (com.bumptech.glide.j) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public final CHILD b() {
            r1 = this;
            com.bumptech.glide.request.transition.g r0 = com.bumptech.glide.request.transition.e.c()
            com.bumptech.glide.j r0 = r1.g(r0)
            return r0
    }

    final com.bumptech.glide.request.transition.g<? super TranscodeType> c() {
            r1 = this;
            com.bumptech.glide.request.transition.g<? super TranscodeType> r0 = r1.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.j r0 = r1.a()
            return r0
    }

    @androidx.annotation.NonNull
    public final CHILD f(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.h r0 = new com.bumptech.glide.request.transition.h
            r0.<init>(r2)
            com.bumptech.glide.j r2 = r1.g(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final CHILD g(@androidx.annotation.NonNull com.bumptech.glide.request.transition.g<? super TranscodeType> r1) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            com.bumptech.glide.request.transition.g r1 = (com.bumptech.glide.request.transition.g) r1
            r0.a = r1
            com.bumptech.glide.j r1 = r0.e()
            return r1
    }

    @androidx.annotation.NonNull
    public final CHILD h(@androidx.annotation.NonNull com.bumptech.glide.request.transition.j.a r2) {
            r1 = this;
            com.bumptech.glide.request.transition.i r0 = new com.bumptech.glide.request.transition.i
            r0.<init>(r2)
            com.bumptech.glide.j r2 = r1.g(r0)
            return r2
    }
}
