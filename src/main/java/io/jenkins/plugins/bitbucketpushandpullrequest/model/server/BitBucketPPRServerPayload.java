package io.jenkins.plugins.bitbucketpushandpullrequest.model.server;

import java.util.ArrayList;
import java.util.List;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.jenkins.plugins.bitbucketpushandpullrequest.model.BitBucketPPRPayload;


public class BitBucketPPRServerPayload implements BitBucketPPRPayload {
  private BitBucketPPRServerActor actor;
  private BitBucketPPRServerRepository repository;
  private List<BitBucketPPRServerChange> changes = new ArrayList<>();

  @SuppressFBWarnings
  @Override
  public BitBucketPPRServerActor getServerActor() {
    return actor;
  }

  @SuppressFBWarnings
  @Override
  public BitBucketPPRServerRepository getServerRepository() {
    return repository;
  }

  @Override
  public List<BitBucketPPRServerChange> getServerChanges() {
    return new ArrayList<>(changes);
  }

  @Override
  public String toString() {
    return "BitBucketPPRServerPayload [actor=" + actor + ", repository=" + repository + ", changes="
        + changes + "]";
  }
}
