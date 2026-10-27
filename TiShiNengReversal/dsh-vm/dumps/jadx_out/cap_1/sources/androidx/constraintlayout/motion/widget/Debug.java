package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Debug {
    public Debug() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void dumpLayoutParams(android.view.ViewGroup.LayoutParams r4, java.lang.String r5) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = "  "
            r1.append(r5)
            java.io.PrintStream r5 = java.lang.System.out
            r4.getClass()
            r5.getClass()
            java.lang.Class r5 = r4.getClass()
            java.lang.reflect.Field[] r5 = r5.getFields()
            r0 = 0
        L47:
            int r1 = r5.length
            if (r0 >= r1) goto L75
            r1 = r5[r0]
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.IllegalAccessException -> L72
            java.lang.String r1 = r1.getName()     // Catch: java.lang.IllegalAccessException -> L72
            java.lang.String r3 = "To"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.IllegalAccessException -> L72
            if (r1 != 0) goto L5d
            goto L72
        L5d:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.IllegalAccessException -> L72
            java.lang.String r3 = "-1"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalAccessException -> L72
            if (r1 == 0) goto L6a
            goto L72
        L6a:
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> L72
            r2.toString()     // Catch: java.lang.IllegalAccessException -> L72
            r1.getClass()     // Catch: java.lang.IllegalAccessException -> L72
        L72:
            int r0 = r0 + 1
            goto L47
        L75:
            java.io.PrintStream r4 = java.lang.System.out
            r4.getClass()
            return
    }

    public static void dumpLayoutParams(android.view.ViewGroup r9, java.lang.String r10) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = "  "
            r1.append(r10)
            int r10 = r9.getChildCount()
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            r0 = 0
            r1 = 0
        L41:
            if (r1 >= r10) goto L90
            android.view.View r2 = r9.getChildAt(r1)
            java.io.PrintStream r3 = java.lang.System.out
            getName(r2)
            r3.getClass()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Field[] r3 = r3.getFields()
            r4 = 0
        L5c:
            int r5 = r3.length
            if (r4 >= r5) goto L8d
            r5 = r3[r4]
            java.lang.Object r6 = r5.get(r2)     // Catch: java.lang.IllegalAccessException -> L8a
            java.lang.String r7 = r5.getName()     // Catch: java.lang.IllegalAccessException -> L8a
            java.lang.String r8 = "To"
            boolean r7 = r7.contains(r8)     // Catch: java.lang.IllegalAccessException -> L8a
            if (r7 != 0) goto L72
            goto L8a
        L72:
            java.lang.String r7 = r6.toString()     // Catch: java.lang.IllegalAccessException -> L8a
            java.lang.String r8 = "-1"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalAccessException -> L8a
            if (r7 == 0) goto L7f
            goto L8a
        L7f:
            java.io.PrintStream r7 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> L8a
            r5.getName()     // Catch: java.lang.IllegalAccessException -> L8a
            r6.toString()     // Catch: java.lang.IllegalAccessException -> L8a
            r7.getClass()     // Catch: java.lang.IllegalAccessException -> L8a
        L8a:
            int r4 = r4 + 1
            goto L5c
        L8d:
            int r1 = r1 + 1
            goto L41
        L90:
            return
    }

    public static void dumpPoc(java.lang.Object r6) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.Class r0 = r6.getClass()
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            java.lang.reflect.Field[] r0 = r0.getFields()
            r1 = 0
        L3c:
            int r2 = r0.length
            if (r1 >= r2) goto La4
            r2 = r0[r1]
            java.lang.Object r3 = r2.get(r6)     // Catch: java.lang.IllegalAccessException -> La1
            java.lang.String r4 = r2.getName()     // Catch: java.lang.IllegalAccessException -> La1
            java.lang.String r5 = "layout_constraint"
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 != 0) goto L52
            goto La1
        L52:
            boolean r4 = r3 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L63
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> La1
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L63
            goto La1
        L63:
            boolean r4 = r3 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L74
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> La1
            java.lang.String r5 = "0"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L74
            goto La1
        L74:
            boolean r4 = r3 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L85
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> La1
            java.lang.String r5 = "1.0"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L85
            goto La1
        L85:
            boolean r4 = r3 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L96
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> La1
            java.lang.String r5 = "0.5"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> La1
            if (r4 == 0) goto L96
            goto La1
        L96:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> La1
            r2.getName()     // Catch: java.lang.IllegalAccessException -> La1
            java.util.Objects.toString(r3)     // Catch: java.lang.IllegalAccessException -> La1
            r4.getClass()     // Catch: java.lang.IllegalAccessException -> La1
        La1:
            int r1 = r1 + 1
            goto L3c
        La4:
            java.io.PrintStream r6 = java.lang.System.out
            r6.getClass()
            return
    }

    public static java.lang.String getActionType(android.view.MotionEvent r5) {
            int r5 = r5.getAction()
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            r1 = 0
        Lb:
            int r2 = r0.length
            if (r1 >= r2) goto L35
            r2 = r0[r1]
            int r3 = r2.getModifiers()     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.IllegalAccessException -> L32
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 != r5) goto L32
            java.lang.String r5 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L32
            return r5
        L32:
            int r1 = r1 + 1
            goto Lb
        L35:
            java.lang.String r5 = "---"
            return r5
    }

    public static java.lang.String getCallFrom(int r2) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r2 = r2 + 2
            r2 = r0[r2]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".("
            r0.append(r1)
            java.lang.String r1 = r2.getFileName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r2 = r2.getLineNumber()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String getLoc() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r2 = r0.getLineNumber()
            r1.append(r2)
            java.lang.String r2 = ") "
            r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            r1.append(r0)
            java.lang.String r0 = "()"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String getLocation() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String getLocation2() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 2
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".("
            r1.append(r2)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String getName(android.content.Context r1, int r2) {
            r0 = -1
            if (r2 == r0) goto Lc
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch: java.lang.Exception -> Lf
            return r1
        Lc:
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "?"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String getName(android.content.Context r5, int[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r0.<init>()     // Catch: java.lang.Exception -> L72
            int r1 = r6.length     // Catch: java.lang.Exception -> L72
            r0.append(r1)     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = "["
            r0.append(r1)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L72
            r1 = 0
        L13:
            int r2 = r6.length     // Catch: java.lang.Exception -> L72
            if (r1 >= r2) goto L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r2.<init>()     // Catch: java.lang.Exception -> L72
            r2.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = " "
            if (r1 != 0) goto L25
            java.lang.String r3 = ""
            goto L26
        L25:
            r3 = r0
        L26:
            r2.append(r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L72
            android.content.res.Resources r3 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Exception -> L72
            r4 = r6[r1]     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Exception -> L72
            java.lang.String r0 = r3.getResourceEntryName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Exception -> L72
            goto L4e
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r3.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = "? "
            r3.append(r4)     // Catch: java.lang.Exception -> L72
            r4 = r6[r1]     // Catch: java.lang.Exception -> L72
            r3.append(r4)     // Catch: java.lang.Exception -> L72
            r3.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L72
        L4e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r3.<init>()     // Catch: java.lang.Exception -> L72
            r3.append(r2)     // Catch: java.lang.Exception -> L72
            r3.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L72
            int r1 = r1 + 1
            goto L13
        L60:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r5.<init>()     // Catch: java.lang.Exception -> L72
            r5.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L72
            return r5
        L72:
            r5 = move-exception
            r5.toString()
            java.lang.String r5 = "UNKNOWN"
            return r5
    }

    public static java.lang.String getName(android.view.View r1) {
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L11
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L11
            int r1 = r1.getId()     // Catch: java.lang.Exception -> L11
            java.lang.String r1 = r0.getResourceEntryName(r1)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            java.lang.String r1 = "UNKNOWN"
            return r1
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2) {
            r0 = -1
            if (r2 != r0) goto L6
            java.lang.String r1 = "UNDEFINED"
            return r1
        L6:
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceEntryName(r2)
            return r1
    }

    public static void logStack(java.lang.String r4, java.lang.String r5, int r6) {
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>()
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()
            int r5 = r4.length
            r0 = 1
            int r5 = r5 - r0
            int r5 = java.lang.Math.min(r6, r5)
            java.lang.String r6 = " "
            r1 = r6
        L13:
            if (r0 > r5) goto L58
            r2 = r4[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ".("
            r2.append(r3)
            r3 = r4[r0]
            java.lang.String r3 = r3.getFileName()
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            r3 = r4[r0]
            int r3 = r3.getLineNumber()
            r2.append(r3)
            java.lang.String r3 = ") "
            r2.append(r3)
            r3 = r4[r0]
            java.lang.String r3 = r3.getMethodName()
            r2.append(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            int r0 = r0 + 1
            goto L13
        L58:
            return
    }

    public static void printStack(java.lang.String r5, int r6) {
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>()
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            int r0 = r5.length
            r1 = 1
            int r0 = r0 - r1
            int r6 = java.lang.Math.min(r6, r0)
            java.lang.String r0 = " "
            r2 = r0
        L13:
            if (r1 > r6) goto L54
            r3 = r5[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ".("
            r3.append(r4)
            r4 = r5[r1]
            java.lang.String r4 = r4.getFileName()
            r3.append(r4)
            java.lang.String r4 = ":"
            r3.append(r4)
            r4 = r5[r1]
            int r4 = r4.getLineNumber()
            r3.append(r4)
            java.lang.String r4 = ") "
            r3.append(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.getClass()
            int r1 = r1 + 1
            goto L13
        L54:
            return
    }
}
