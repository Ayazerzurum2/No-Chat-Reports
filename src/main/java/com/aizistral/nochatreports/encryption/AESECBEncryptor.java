package com.aizistral.nochatreports.encryption;

import net.minecraft.util.Tuple;

import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;

public class AESECBEncryptor extends AESEncryptor<AESECBEncryption> {

	protected AESECBEncryptor(String key) throws InvalidKeyException {
		super(key, Encryption.AES_ECB);
	}

	protected AESECBEncryptor(SecretKey key, String mode, String padding, boolean iv) throws InvalidKeyException {
		super(key, Encryption.AES_ECB);
	}

	@Override
	protected Tuple<AlgorithmParameterSpec, byte[]> generateIV() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	@Override
	protected Tuple<AlgorithmParameterSpec, byte[]> splitIV(byte[] message) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

}
