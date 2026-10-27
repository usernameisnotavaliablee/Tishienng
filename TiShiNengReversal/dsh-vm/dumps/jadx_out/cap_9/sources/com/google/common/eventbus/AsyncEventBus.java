package com.google.common.eventbus;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AsyncEventBus extends com.google.common.eventbus.EventBus {
    public AsyncEventBus(java.lang.String r3, java.util.concurrent.Executor r4) {
            r2 = this;
            com.google.common.eventbus.Dispatcher r0 = com.google.common.eventbus.Dispatcher.legacyAsync()
            com.google.common.eventbus.EventBus$LoggingHandler r1 = com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AsyncEventBus(java.util.concurrent.Executor r4) {
            r3 = this;
            com.google.common.eventbus.Dispatcher r0 = com.google.common.eventbus.Dispatcher.legacyAsync()
            com.google.common.eventbus.EventBus$LoggingHandler r1 = com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE
            java.lang.String r2 = "default"
            r3.<init>(r2, r4, r0, r1)
            return
    }

    public AsyncEventBus(java.util.concurrent.Executor r3, com.google.common.eventbus.SubscriberExceptionHandler r4) {
            r2 = this;
            java.lang.String r0 = "default"
            com.google.common.eventbus.Dispatcher r1 = com.google.common.eventbus.Dispatcher.legacyAsync()
            r2.<init>(r0, r3, r1, r4)
            return
    }
}
