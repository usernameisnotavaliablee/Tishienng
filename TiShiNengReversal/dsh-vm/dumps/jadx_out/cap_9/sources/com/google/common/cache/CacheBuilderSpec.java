package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CacheBuilderSpec {
    private static final com.google.common.base.Splitter KEYS_SPLITTER = null;
    private static final com.google.common.base.Splitter KEY_VALUE_SPLITTER = null;
    private static final com.google.common.collect.ImmutableMap<java.lang.String, com.google.common.cache.CacheBuilderSpec.ValueParser> VALUE_PARSERS = null;

    @com.google.common.annotations.VisibleForTesting
    long accessExpirationDuration;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.util.concurrent.TimeUnit accessExpirationTimeUnit;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.lang.Integer concurrencyLevel;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.lang.Integer initialCapacity;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    com.google.common.cache.LocalCache.Strength keyStrength;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.lang.Long maximumSize;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.lang.Long maximumWeight;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.lang.Boolean recordStats;

    @com.google.common.annotations.VisibleForTesting
    long refreshDuration;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.util.concurrent.TimeUnit refreshTimeUnit;
    private final java.lang.String specification;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    com.google.common.cache.LocalCache.Strength valueStrength;

    @com.google.common.annotations.VisibleForTesting
    long writeExpirationDuration;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.util.concurrent.TimeUnit writeExpirationTimeUnit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength = null;

        static {
                com.google.common.cache.LocalCache$Strength[] r0 = com.google.common.cache.LocalCache.Strength.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength = r0
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.WEAK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.SOFT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AccessDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        AccessDurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(com.google.common.cache.CacheBuilderSpec r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = r3.accessExpirationTimeUnit
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "expireAfterAccess already set"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r3.accessExpirationDuration = r4
                r3.accessExpirationTimeUnit = r6
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ConcurrencyLevelParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        ConcurrencyLevelParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(com.google.common.cache.CacheBuilderSpec r4, int r5) {
                r3 = this;
                java.lang.Integer r0 = r4.concurrencyLevel
                if (r0 != 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                java.lang.String r2 = "concurrency level was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.concurrencyLevel = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class DurationParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        DurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r7, java.lang.String r8, java.lang.String r9) {
                r6 = this;
                r0 = 0
                r1 = 1
                if (r9 == 0) goto Lc
                boolean r2 = r9.isEmpty()
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                java.lang.String r3 = "value of key %s omitted"
                com.google.common.base.Preconditions.checkArgument(r2, r3, r8)
                r2 = 2
                int r3 = r9.length()     // Catch: java.lang.NumberFormatException -> L5a
                int r3 = r3 - r1
                char r3 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L5a
                r4 = 100
                if (r3 == r4) goto L47
                r4 = 104(0x68, float:1.46E-43)
                if (r3 == r4) goto L44
                r4 = 109(0x6d, float:1.53E-43)
                if (r3 == r4) goto L41
                r4 = 115(0x73, float:1.61E-43)
                if (r3 != r4) goto L2f
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NumberFormatException -> L5a
                goto L49
            L2f:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.NumberFormatException -> L5a
                java.lang.String r3 = "key %s invalid format.  was %s, must end with one of [dDhHmMsS]"
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NumberFormatException -> L5a
                r4[r0] = r8     // Catch: java.lang.NumberFormatException -> L5a
                r4[r1] = r9     // Catch: java.lang.NumberFormatException -> L5a
                java.lang.String r3 = com.google.common.cache.CacheBuilderSpec.access$000(r3, r4)     // Catch: java.lang.NumberFormatException -> L5a
                r7.<init>(r3)     // Catch: java.lang.NumberFormatException -> L5a
                throw r7     // Catch: java.lang.NumberFormatException -> L5a
            L41:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NumberFormatException -> L5a
                goto L49
            L44:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NumberFormatException -> L5a
                goto L49
            L47:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NumberFormatException -> L5a
            L49:
                int r4 = r9.length()     // Catch: java.lang.NumberFormatException -> L5a
                int r4 = r4 - r1
                java.lang.String r4 = r9.substring(r0, r4)     // Catch: java.lang.NumberFormatException -> L5a
                long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L5a
                r6.parseDuration(r7, r4, r3)     // Catch: java.lang.NumberFormatException -> L5a
                return
            L5a:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r0] = r8
                r2[r1] = r9
                java.lang.String r8 = "key %s value set to %s, must be integer"
                java.lang.String r8 = com.google.common.cache.CacheBuilderSpec.access$000(r8, r2)
                r7.<init>(r8)
                throw r7
        }

        protected abstract void parseDuration(com.google.common.cache.CacheBuilderSpec r1, long r2, java.util.concurrent.TimeUnit r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class InitialCapacityParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        InitialCapacityParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(com.google.common.cache.CacheBuilderSpec r4, int r5) {
                r3 = this;
                java.lang.Integer r0 = r4.initialCapacity
                if (r0 != 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                java.lang.String r2 = "initial capacity was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.initialCapacity = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class IntegerParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        IntegerParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r5, java.lang.String r6, java.lang.String r7) {
                r4 = this;
                r0 = 0
                r1 = 1
                if (r7 == 0) goto Lc
                boolean r2 = r7.isEmpty()
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                java.lang.String r3 = "value of key %s omitted"
                com.google.common.base.Preconditions.checkArgument(r2, r3, r6)
                int r2 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L1a
                r4.parseInteger(r5, r2)     // Catch: java.lang.NumberFormatException -> L1a
                return
            L1a:
                r5 = move-exception
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r6
                r3[r1] = r7
                java.lang.String r6 = "key %s value set to %s, must be integer"
                java.lang.String r6 = com.google.common.cache.CacheBuilderSpec.access$000(r6, r3)
                r2.<init>(r6, r5)
                throw r2
        }

        protected abstract void parseInteger(com.google.common.cache.CacheBuilderSpec r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class KeyStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public KeyStrengthParser(com.google.common.cache.LocalCache.Strength r1) {
                r0 = this;
                r0.<init>()
                r0.strength = r1
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r4, java.lang.String r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r6) {
                r3 = this;
                r0 = 0
                r1 = 1
                if (r6 != 0) goto L6
                r6 = 1
                goto L7
            L6:
                r6 = 0
            L7:
                java.lang.String r2 = "key %s does not take values"
                com.google.common.base.Preconditions.checkArgument(r6, r2, r5)
                com.google.common.cache.LocalCache$Strength r6 = r4.keyStrength
                if (r6 != 0) goto L11
                r0 = 1
            L11:
                java.lang.String r1 = "%s was already set to %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r6)
                com.google.common.cache.LocalCache$Strength r5 = r3.strength
                r4.keyStrength = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class LongParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        LongParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r5, java.lang.String r6, java.lang.String r7) {
                r4 = this;
                r0 = 0
                r1 = 1
                if (r7 == 0) goto Lc
                boolean r2 = r7.isEmpty()
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                java.lang.String r3 = "value of key %s omitted"
                com.google.common.base.Preconditions.checkArgument(r2, r3, r6)
                long r2 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L1a
                r4.parseLong(r5, r2)     // Catch: java.lang.NumberFormatException -> L1a
                return
            L1a:
                r5 = move-exception
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r6
                r3[r1] = r7
                java.lang.String r6 = "key %s value set to %s, must be integer"
                java.lang.String r6 = com.google.common.cache.CacheBuilderSpec.access$000(r6, r3)
                r2.<init>(r6, r5)
                throw r2
        }

        protected abstract void parseLong(com.google.common.cache.CacheBuilderSpec r1, long r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MaximumSizeParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        MaximumSizeParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(com.google.common.cache.CacheBuilderSpec r6, long r7) {
                r5 = this;
                java.lang.Long r0 = r6.maximumSize
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                java.lang.String r4 = "maximum size was already set to "
                com.google.common.base.Preconditions.checkArgument(r3, r4, r0)
                java.lang.Long r0 = r6.maximumWeight
                if (r0 != 0) goto L13
                r1 = 1
            L13:
                java.lang.String r2 = "maximum weight was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6.maximumSize = r7
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MaximumWeightParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        MaximumWeightParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(com.google.common.cache.CacheBuilderSpec r6, long r7) {
                r5 = this;
                java.lang.Long r0 = r6.maximumWeight
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                java.lang.String r4 = "maximum weight was already set to "
                com.google.common.base.Preconditions.checkArgument(r3, r4, r0)
                java.lang.Long r0 = r6.maximumSize
                if (r0 != 0) goto L13
                r1 = 1
            L13:
                java.lang.String r2 = "maximum size was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6.maximumWeight = r7
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RecordStatsParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        RecordStatsParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r3, java.lang.String r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r5) {
                r2 = this;
                r4 = 0
                r0 = 1
                if (r5 != 0) goto L6
                r5 = 1
                goto L7
            L6:
                r5 = 0
            L7:
                java.lang.String r1 = "recordStats does not take values"
                com.google.common.base.Preconditions.checkArgument(r5, r1)
                java.lang.Boolean r5 = r3.recordStats
                if (r5 != 0) goto L11
                r4 = 1
            L11:
                java.lang.String r5 = "recordStats already set"
                com.google.common.base.Preconditions.checkArgument(r4, r5)
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                r3.recordStats = r4
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RefreshDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        RefreshDurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(com.google.common.cache.CacheBuilderSpec r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = r3.refreshTimeUnit
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "refreshAfterWrite already set"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r3.refreshDuration = r4
                r3.refreshTimeUnit = r6
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface ValueParser {
        void parse(com.google.common.cache.CacheBuilderSpec r1, java.lang.String r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ValueStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public ValueStrengthParser(com.google.common.cache.LocalCache.Strength r1) {
                r0 = this;
                r0.<init>()
                r0.strength = r1
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r4, java.lang.String r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r6) {
                r3 = this;
                r0 = 0
                r1 = 1
                if (r6 != 0) goto L6
                r6 = 1
                goto L7
            L6:
                r6 = 0
            L7:
                java.lang.String r2 = "key %s does not take values"
                com.google.common.base.Preconditions.checkArgument(r6, r2, r5)
                com.google.common.cache.LocalCache$Strength r6 = r4.valueStrength
                if (r6 != 0) goto L11
                r0 = 1
            L11:
                java.lang.String r1 = "%s was already set to %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r6)
                com.google.common.cache.LocalCache$Strength r5 = r3.strength
                r4.valueStrength = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class WriteDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        WriteDurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(com.google.common.cache.CacheBuilderSpec r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = r3.writeExpirationTimeUnit
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "expireAfterWrite already set"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r3.writeExpirationDuration = r4
                r3.writeExpirationTimeUnit = r6
                return
        }
    }

    static {
            r0 = 44
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r0 = r0.trimResults()
            com.google.common.cache.CacheBuilderSpec.KEYS_SPLITTER = r0
            r0 = 61
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r0 = r0.trimResults()
            com.google.common.cache.CacheBuilderSpec.KEY_VALUE_SPLITTER = r0
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            com.google.common.cache.CacheBuilderSpec$InitialCapacityParser r1 = new com.google.common.cache.CacheBuilderSpec$InitialCapacityParser
            r1.<init>()
            java.lang.String r2 = "initialCapacity"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$MaximumSizeParser r1 = new com.google.common.cache.CacheBuilderSpec$MaximumSizeParser
            r1.<init>()
            java.lang.String r2 = "maximumSize"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$MaximumWeightParser r1 = new com.google.common.cache.CacheBuilderSpec$MaximumWeightParser
            r1.<init>()
            java.lang.String r2 = "maximumWeight"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$ConcurrencyLevelParser r1 = new com.google.common.cache.CacheBuilderSpec$ConcurrencyLevelParser
            r1.<init>()
            java.lang.String r2 = "concurrencyLevel"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$KeyStrengthParser r1 = new com.google.common.cache.CacheBuilderSpec$KeyStrengthParser
            com.google.common.cache.LocalCache$Strength r2 = com.google.common.cache.LocalCache.Strength.WEAK
            r1.<init>(r2)
            java.lang.String r3 = "weakKeys"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r3, r1)
            com.google.common.cache.CacheBuilderSpec$ValueStrengthParser r1 = new com.google.common.cache.CacheBuilderSpec$ValueStrengthParser
            com.google.common.cache.LocalCache$Strength r3 = com.google.common.cache.LocalCache.Strength.SOFT
            r1.<init>(r3)
            java.lang.String r3 = "softValues"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r3, r1)
            com.google.common.cache.CacheBuilderSpec$ValueStrengthParser r1 = new com.google.common.cache.CacheBuilderSpec$ValueStrengthParser
            r1.<init>(r2)
            java.lang.String r2 = "weakValues"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$RecordStatsParser r1 = new com.google.common.cache.CacheBuilderSpec$RecordStatsParser
            r1.<init>()
            java.lang.String r2 = "recordStats"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$AccessDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$AccessDurationParser
            r1.<init>()
            java.lang.String r2 = "expireAfterAccess"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$WriteDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$WriteDurationParser
            r1.<init>()
            java.lang.String r2 = "expireAfterWrite"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$RefreshDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$RefreshDurationParser
            r1.<init>()
            java.lang.String r2 = "refreshAfterWrite"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$RefreshDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$RefreshDurationParser
            r1.<init>()
            java.lang.String r2 = "refreshInterval"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.collect.ImmutableMap r0 = r0.build()
            com.google.common.cache.CacheBuilderSpec.VALUE_PARSERS = r0
            return
    }

    private CacheBuilderSpec(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.specification = r1
            return
    }

    static /* synthetic */ java.lang.String access$000(java.lang.String r0, java.lang.Object[] r1) {
            java.lang.String r0 = format(r0, r1)
            return r0
    }

    public static com.google.common.cache.CacheBuilderSpec disableCaching() {
            java.lang.String r0 = "maximumSize=0"
            com.google.common.cache.CacheBuilderSpec r0 = parse(r0)
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private static java.lang.Long durationInNanos(long r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.concurrent.TimeUnit r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            long r0 = r2.toNanos(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    private static java.lang.String format(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String r7) {
            com.google.common.cache.CacheBuilderSpec r0 = new com.google.common.cache.CacheBuilderSpec
            r0.<init>(r7)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L6e
            com.google.common.base.Splitter r1 = com.google.common.cache.CacheBuilderSpec.KEYS_SPLITTER
            java.lang.Iterable r7 = r1.split(r7)
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.base.Splitter r2 = com.google.common.cache.CacheBuilderSpec.KEY_VALUE_SPLITTER
            java.lang.Iterable r2 = r2.split(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            boolean r3 = r2.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "blank key-value pair"
            com.google.common.base.Preconditions.checkArgument(r3, r5)
            int r3 = r2.size()
            r5 = 2
            r6 = 0
            if (r3 > r5) goto L40
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            java.lang.String r5 = "key-value pair %s with more than one equals sign"
            com.google.common.base.Preconditions.checkArgument(r3, r5, r1)
            java.lang.Object r1 = r2.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.common.cache.CacheBuilderSpec$ValueParser> r3 = com.google.common.cache.CacheBuilderSpec.VALUE_PARSERS
            java.lang.Object r3 = r3.get(r1)
            com.google.common.cache.CacheBuilderSpec$ValueParser r3 = (com.google.common.cache.CacheBuilderSpec.ValueParser) r3
            if (r3 == 0) goto L57
            r6 = 1
        L57:
            java.lang.String r5 = "unknown key %s"
            com.google.common.base.Preconditions.checkArgument(r6, r5, r1)
            int r5 = r2.size()
            if (r5 != r4) goto L64
            r2 = 0
            goto L6a
        L64:
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
        L6a:
            r3.parse(r0, r1, r2)
            goto L15
        L6e:
            return r0
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.google.common.cache.CacheBuilderSpec
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.cache.CacheBuilderSpec r7 = (com.google.common.cache.CacheBuilderSpec) r7
            java.lang.Integer r1 = r6.initialCapacity
            java.lang.Integer r3 = r7.initialCapacity
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Long r1 = r6.maximumSize
            java.lang.Long r3 = r7.maximumSize
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Long r1 = r6.maximumWeight
            java.lang.Long r3 = r7.maximumWeight
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Integer r1 = r6.concurrencyLevel
            java.lang.Integer r3 = r7.concurrencyLevel
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            com.google.common.cache.LocalCache$Strength r1 = r6.keyStrength
            com.google.common.cache.LocalCache$Strength r3 = r7.keyStrength
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            com.google.common.cache.LocalCache$Strength r1 = r6.valueStrength
            com.google.common.cache.LocalCache$Strength r3 = r7.valueStrength
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Boolean r1 = r6.recordStats
            java.lang.Boolean r3 = r7.recordStats
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            long r3 = r6.writeExpirationDuration
            java.util.concurrent.TimeUnit r1 = r6.writeExpirationTimeUnit
            java.lang.Long r1 = durationInNanos(r3, r1)
            long r3 = r7.writeExpirationDuration
            java.util.concurrent.TimeUnit r5 = r7.writeExpirationTimeUnit
            java.lang.Long r3 = durationInNanos(r3, r5)
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            long r3 = r6.accessExpirationDuration
            java.util.concurrent.TimeUnit r1 = r6.accessExpirationTimeUnit
            java.lang.Long r1 = durationInNanos(r3, r1)
            long r3 = r7.accessExpirationDuration
            java.util.concurrent.TimeUnit r5 = r7.accessExpirationTimeUnit
            java.lang.Long r3 = durationInNanos(r3, r5)
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            long r3 = r6.refreshDuration
            java.util.concurrent.TimeUnit r1 = r6.refreshTimeUnit
            java.lang.Long r1 = durationInNanos(r3, r1)
            long r3 = r7.refreshDuration
            java.util.concurrent.TimeUnit r7 = r7.refreshTimeUnit
            java.lang.Long r7 = durationInNanos(r3, r7)
            boolean r7 = com.google.common.base.Objects.equal(r1, r7)
            if (r7 == 0) goto L95
            return r0
        L95:
            return r2
    }

    public int hashCode() {
            r12 = this;
            java.lang.Integer r0 = r12.initialCapacity
            java.lang.Long r1 = r12.maximumSize
            java.lang.Long r2 = r12.maximumWeight
            java.lang.Integer r3 = r12.concurrencyLevel
            com.google.common.cache.LocalCache$Strength r4 = r12.keyStrength
            com.google.common.cache.LocalCache$Strength r5 = r12.valueStrength
            java.lang.Boolean r6 = r12.recordStats
            long r7 = r12.writeExpirationDuration
            java.util.concurrent.TimeUnit r9 = r12.writeExpirationTimeUnit
            java.lang.Long r7 = durationInNanos(r7, r9)
            long r8 = r12.accessExpirationDuration
            java.util.concurrent.TimeUnit r10 = r12.accessExpirationTimeUnit
            java.lang.Long r8 = durationInNanos(r8, r10)
            long r9 = r12.refreshDuration
            java.util.concurrent.TimeUnit r11 = r12.refreshTimeUnit
            java.lang.Long r9 = durationInNanos(r9, r11)
            r10 = 10
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r11 = 0
            r10[r11] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r6
            r0 = 7
            r10[r0] = r7
            r0 = 8
            r10[r0] = r8
            r0 = 9
            r10[r0] = r9
            int r0 = com.google.common.base.Objects.hashCode(r10)
            return r0
    }

    com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> toCacheBuilder() {
            r4 = this;
            com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
            java.lang.Integer r1 = r4.initialCapacity
            if (r1 == 0) goto Lf
            int r1 = r1.intValue()
            r0.initialCapacity(r1)
        Lf:
            java.lang.Long r1 = r4.maximumSize
            if (r1 == 0) goto L1a
            long r1 = r1.longValue()
            r0.maximumSize(r1)
        L1a:
            java.lang.Long r1 = r4.maximumWeight
            if (r1 == 0) goto L25
            long r1 = r1.longValue()
            r0.maximumWeight(r1)
        L25:
            java.lang.Integer r1 = r4.concurrencyLevel
            if (r1 == 0) goto L30
            int r1 = r1.intValue()
            r0.concurrencyLevel(r1)
        L30:
            com.google.common.cache.LocalCache$Strength r1 = r4.keyStrength
            r2 = 1
            if (r1 == 0) goto L49
            int[] r3 = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 != r2) goto L43
            r0.weakKeys()
            goto L49
        L43:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L49:
            com.google.common.cache.LocalCache$Strength r1 = r4.valueStrength
            if (r1 == 0) goto L67
            int[] r3 = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L64
            r2 = 2
            if (r1 != r2) goto L5e
            r0.softValues()
            goto L67
        L5e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L64:
            r0.weakValues()
        L67:
            java.lang.Boolean r1 = r4.recordStats
            if (r1 == 0) goto L74
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L74
            r0.recordStats()
        L74:
            java.util.concurrent.TimeUnit r1 = r4.writeExpirationTimeUnit
            if (r1 == 0) goto L7d
            long r2 = r4.writeExpirationDuration
            r0.expireAfterWrite(r2, r1)
        L7d:
            java.util.concurrent.TimeUnit r1 = r4.accessExpirationTimeUnit
            if (r1 == 0) goto L86
            long r2 = r4.accessExpirationDuration
            r0.expireAfterAccess(r2, r1)
        L86:
            java.util.concurrent.TimeUnit r1 = r4.refreshTimeUnit
            if (r1 == 0) goto L8f
            long r2 = r4.refreshDuration
            r0.refreshAfterWrite(r2, r1)
        L8f:
            return r0
    }

    public java.lang.String toParsableString() {
            r1 = this;
            java.lang.String r0 = r1.specification
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r2)
            java.lang.String r1 = r2.toParsableString()
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.addValue(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
