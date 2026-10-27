package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class l<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> {
    l() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> a();

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = r1.a()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = r1.a()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = r1.a()
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = r1.a()
            int r0 = r0.size()
            return r0
    }
}
