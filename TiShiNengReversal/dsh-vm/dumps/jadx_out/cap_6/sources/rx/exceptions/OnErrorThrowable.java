package rx.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OnErrorThrowable extends java.lang.RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final java.lang.Object value;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class OnNextValue extends java.lang.RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final java.lang.Object value;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a {
            static final java.util.Set<java.lang.Class<?>> a = null;

            static {
                    java.util.Set r0 = a()
                    rx.exceptions.OnErrorThrowable.OnNextValue.a.a = r0
                    return
            }

            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private static java.util.Set<java.lang.Class<?>> a() {
                    java.util.HashSet r0 = new java.util.HashSet
                    r0.<init>()
                    java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                    r0.add(r1)
                    java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                    r0.add(r1)
                    return r0
            }
        }

        public OnNextValue(java.lang.Object r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OnError while emitting onNext value: "
                r0.append(r1)
                java.lang.String r1 = renderValue(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                boolean r0 = r3 instanceof java.io.Serializable
                if (r0 == 0) goto L1d
                goto L27
            L1d:
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L22
                goto L27
            L22:
                r3 = move-exception
                java.lang.String r3 = r3.getMessage()
            L27:
                r2.value = r3
                return
        }

        static java.lang.String renderValue(java.lang.Object r2) {
                if (r2 != 0) goto L5
                java.lang.String r2 = "null"
                return r2
            L5:
                java.util.Set<java.lang.Class<?>> r0 = rx.exceptions.OnErrorThrowable.OnNextValue.a.a
                java.lang.Class r1 = r2.getClass()
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L16
                java.lang.String r2 = r2.toString()
                return r2
            L16:
                boolean r0 = r2 instanceof java.lang.String
                if (r0 == 0) goto L1d
                java.lang.String r2 = (java.lang.String) r2
                return r2
            L1d:
                boolean r0 = r2 instanceof java.lang.Enum
                if (r0 == 0) goto L28
                java.lang.Enum r2 = (java.lang.Enum) r2
                java.lang.String r2 = r2.name()
                return r2
            L28:
                rx.plugins.f r0 = rx.plugins.f.c()
                rx.plugins.b r0 = r0.b()
                java.lang.String r0 = r0.b(r2)
                if (r0 == 0) goto L37
                return r0
            L37:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                r0.append(r2)
                java.lang.String r2 = ".class"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }

        public java.lang.Object getValue() {
                r1 = this;
                java.lang.Object r0 = r1.value
                return r0
        }
    }

    private OnErrorThrowable(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.hasValue = r1
            r1 = 0
            r0.value = r1
            return
    }

    private OnErrorThrowable(java.lang.Throwable r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.hasValue = r1
            boolean r1 = r2 instanceof java.io.Serializable
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
        L15:
            r0.value = r2
            return
    }

    public static java.lang.Throwable addValueAsLastCause(java.lang.Throwable r2, java.lang.Object r3) {
            if (r2 != 0) goto L7
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
        L7:
            java.lang.Throwable r0 = rx.exceptions.a.b(r2)
            boolean r1 = r0 instanceof rx.exceptions.OnErrorThrowable.OnNextValue
            if (r1 == 0) goto L18
            rx.exceptions.OnErrorThrowable$OnNextValue r0 = (rx.exceptions.OnErrorThrowable.OnNextValue) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 != r3) goto L18
            return r2
        L18:
            rx.exceptions.OnErrorThrowable$OnNextValue r0 = new rx.exceptions.OnErrorThrowable$OnNextValue
            r0.<init>(r3)
            rx.exceptions.a.a(r2, r0)
            return r2
    }

    public static rx.exceptions.OnErrorThrowable from(java.lang.Throwable r2) {
            if (r2 != 0) goto L7
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
        L7:
            java.lang.Throwable r0 = rx.exceptions.a.b(r2)
            boolean r1 = r0 instanceof rx.exceptions.OnErrorThrowable.OnNextValue
            if (r1 == 0) goto L1b
            rx.exceptions.OnErrorThrowable r1 = new rx.exceptions.OnErrorThrowable
            rx.exceptions.OnErrorThrowable$OnNextValue r0 = (rx.exceptions.OnErrorThrowable.OnNextValue) r0
            java.lang.Object r0 = r0.getValue()
            r1.<init>(r2, r0)
            return r1
        L1b:
            rx.exceptions.OnErrorThrowable r0 = new rx.exceptions.OnErrorThrowable
            r0.<init>(r2)
            return r0
    }

    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    public boolean isValueNull() {
            r1 = this;
            boolean r0 = r1.hasValue
            return r0
    }
}
