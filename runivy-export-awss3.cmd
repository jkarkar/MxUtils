rm userlib/*
java -jar build\apache-ivy-2.4.0\ivy-2.4.0.jar -ivy ivy.xml -confs export-awss3 -retrieve "userlib/[artifact]-[revision].[ext]"
for %%f in (userlib\*) do touch %%f.MxUtils-AwsS3.RequiredLib