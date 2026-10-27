package com.google.j2objc.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public @interface ReflectionSupport {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Level extends java.lang.Enum<com.google.j2objc.annotations.ReflectionSupport.Level> {
        private static final /* synthetic */ com.google.j2objc.annotations.ReflectionSupport.Level[] $VALUES = null;
        public static final com.google.j2objc.annotations.ReflectionSupport.Level FULL = null;
        public static final com.google.j2objc.annotations.ReflectionSupport.Level NATIVE_ONLY = null;

        static {
                com.google.j2objc.annotations.ReflectionSupport$Level r0 = new com.google.j2objc.annotations.ReflectionSupport$Level
                java.lang.String r1 = "NATIVE_ONLY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.j2objc.annotations.ReflectionSupport.Level.NATIVE_ONLY = r0
                com.google.j2objc.annotations.ReflectionSupport$Level r1 = new com.google.j2objc.annotations.ReflectionSupport$Level
                java.lang.String r3 = "FULL"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.j2objc.annotations.ReflectionSupport.Level.FULL = r1
                r3 = 2
                com.google.j2objc.annotations.ReflectionSupport$Level[] r3 = new com.google.j2objc.annotations.ReflectionSupport.Level[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.j2objc.annotations.ReflectionSupport.Level.$VALUES = r3
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.j2objc.annotations.ReflectionSupport.Level valueOf(java.lang.String r1) {
                java.lang.Class<com.google.j2objc.annotations.ReflectionSupport$Level> r0 = com.google.j2objc.annotations.ReflectionSupport.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.j2objc.annotations.ReflectionSupport$Level r1 = (com.google.j2objc.annotations.ReflectionSupport.Level) r1
                return r1
        }

        public static com.google.j2objc.annotations.ReflectionSupport.Level[] values() {
                com.google.j2objc.annotations.ReflectionSupport$Level[] r0 = com.google.j2objc.annotations.ReflectionSupport.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.j2objc.annotations.ReflectionSupport$Level[] r0 = (com.google.j2objc.annotations.ReflectionSupport.Level[]) r0
                return r0
        }
    }

    com.google.j2objc.annotations.ReflectionSupport.Level value();
}
