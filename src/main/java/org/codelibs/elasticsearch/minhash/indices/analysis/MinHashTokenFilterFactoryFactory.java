package org.codelibs.elasticsearch.minhash.indices.analysis;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.analysis.PreBuiltTokenFilterFactoryFactory;
import org.elasticsearch.index.analysis.TokenFilterFactory;

public class MinHashTokenFilterFactoryFactory extends
        PreBuiltTokenFilterFactoryFactory {
    private final TokenFilterFactory tokenFilterFactory;

    public MinHashTokenFilterFactoryFactory(
            TokenFilterFactory tokenFilterFactory) {
        super(tokenFilterFactory);
        this.tokenFilterFactory = tokenFilterFactory;
    }

    @Override
    public TokenFilterFactory create(String name, Settings settings) {
        return tokenFilterFactory;
    }
}
