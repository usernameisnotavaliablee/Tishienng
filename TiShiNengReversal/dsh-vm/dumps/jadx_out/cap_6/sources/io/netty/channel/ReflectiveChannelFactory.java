package io.netty.channel;

import io.netty.channel.Channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ReflectiveChannelFactory<T extends io.netty.channel.Channel> implements io.netty.channel.ChannelFactory<T> {
    private final java.lang.reflect.Constructor<? extends T> constructor;

    public ReflectiveChannelFactory(java.lang.Class<? extends T> r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "clazz"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            r0 = 0
            java.lang.reflect.Constructor r0 = r5.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L10
            r4.constructor = r0     // Catch: java.lang.NoSuchMethodException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            java.lang.String r5 = io.netty.util.internal.StringUtil.simpleClassName(r5)
            r2.append(r5)
            java.lang.String r5 = " does not have a public non-arg constructor"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    @Override // io.netty.channel.ChannelFactory, io.netty.bootstrap.ChannelFactory
    public T newChannel() {
            r4 = this;
            java.lang.reflect.Constructor<? extends T extends io.netty.channel.Channel> r0 = r4.constructor     // Catch: java.lang.Throwable -> La
            r1 = 0
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to create Channel from class "
            r2.append(r3)
            java.lang.reflect.Constructor<? extends T extends io.netty.channel.Channel> r3 = r4.constructor
            java.lang.Class r3 = r3.getDeclaringClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<io.netty.channel.ReflectiveChannelFactory> r1 = io.netty.channel.ReflectiveChannelFactory.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.reflect.Constructor<? extends T extends io.netty.channel.Channel> r1 = r2.constructor
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ".class)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
