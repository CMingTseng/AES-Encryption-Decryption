# AES-Encryption-Decryption

============

Encryption-Decryption using AES(Advance Encryption Standard) symmetric algorithm in Android

You can encrypt/ decrypt passowrd, tocken or any secret key 

# How to setup 
Gradle : <br>
Add the below dependency into your gradle file:

    compile 'com.azrashaikh.cryptography:aes-lib:1.0.1'
    
<br> Pom : <br>
    
   
    <dependency org='com.azrashaikh.cryptography' name='aes-lib' rev='1.0.1'>
        <artifact name='$AID' ext='pom'></artifact>
    </dependency>
  

    
# How to use
1. Create instance of class SymmetricAlgorithmAES: 

     `SymmetricAlgorithmAES symmetricAlgorithmAES= new SymmetricAlgorithmAES(this);`
2. To encypt  data :

     `symmetricAlgorithmAES.encryptString("yourStringToEncypt");`

3. To decrypt data :

     `symmetricAlgorithmAES.decryptString("yourStringToEncypt");`


Screenshots : 
<ul> 
<li> Enter the text to encrypt  <br>
<br>
<img src="http://oi60.tinypic.com/clziq.jpg">

</li>
<br>
<li> You can see the encrypted text in alert box  <br>
<br>
<img src=http://oi62.tinypic.com/2vcyex3.jpg>
</li>
<br>
<li> You can get back the original text 
 <br>
<br>
<img src=http://oi58.tinypic.com/mcuufd.jpg>
 </li>
</ul>
