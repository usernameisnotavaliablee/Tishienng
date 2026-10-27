package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DependencyCycleException extends com.google.firebase.components.DependencyException {
    private final java.util.List<com.google.firebase.components.Component<?>> componentsInCycle;

    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependency cycle detected: "
            r0.append(r1)
            java.lang.Object[] r1 = r3.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.componentsInCycle = r3
            return
    }

    public java.util.List<com.google.firebase.components.Component<?>> getComponentsInCycle() {
            r1 = this;
            java.util.List<com.google.firebase.components.Component<?>> r0 = r1.componentsInCycle
            return r0
    }
}
